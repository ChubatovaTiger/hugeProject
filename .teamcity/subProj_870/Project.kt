package subProj_870

import subProj_870.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_870")
    name = "subProj 870"

    buildType(subProj_bt_870_2)
    buildType(subProj_bt_870_1)
    buildType(subProj_bt_870_0)
    buildType(subProj_bt_870_5)
    buildType(subProj_bt_870_4)
    buildType(subProj_bt_870_3)
})
