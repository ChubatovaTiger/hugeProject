package subProj_8

import subProj_8.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_8")
    name = "subProj 8"

    buildType(subProj_bt_8_4)
    buildType(subProj_bt_8_5)
    buildType(subProj_bt_8_2)
    buildType(subProj_bt_8_3)
    buildType(subProj_bt_8_0)
    buildType(subProj_bt_8_1)
})
