package subProj_35

import subProj_35.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_35")
    name = "subProj 35"

    buildType(subProj_bt_35_0)
    buildType(subProj_bt_35_1)
    buildType(subProj_bt_35_2)
    buildType(subProj_bt_35_3)
    buildType(subProj_bt_35_4)
    buildType(subProj_bt_35_5)
})
