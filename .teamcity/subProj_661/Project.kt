package subProj_661

import subProj_661.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_661")
    name = "subProj 661"

    buildType(subProj_bt_661_2)
    buildType(subProj_bt_661_1)
    buildType(subProj_bt_661_0)
    buildType(subProj_bt_661_5)
    buildType(subProj_bt_661_4)
    buildType(subProj_bt_661_3)
})
