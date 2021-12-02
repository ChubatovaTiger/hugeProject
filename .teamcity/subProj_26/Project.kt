package subProj_26

import subProj_26.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_26")
    name = "subProj 26"

    buildType(subProj_bt_26_0)
    buildType(subProj_bt_26_1)
    buildType(subProj_bt_26_2)
    buildType(subProj_bt_26_3)
    buildType(subProj_bt_26_4)
    buildType(subProj_bt_26_5)
})
