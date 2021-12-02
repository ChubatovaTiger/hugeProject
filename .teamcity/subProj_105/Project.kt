package subProj_105

import subProj_105.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_105")
    name = "subProj 105"

    buildType(subProj_bt_105_4)
    buildType(subProj_bt_105_5)
    buildType(subProj_bt_105_2)
    buildType(subProj_bt_105_3)
    buildType(subProj_bt_105_0)
    buildType(subProj_bt_105_1)
})
