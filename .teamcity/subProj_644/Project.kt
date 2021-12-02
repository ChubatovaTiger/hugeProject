package subProj_644

import subProj_644.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_644")
    name = "subProj 644"

    buildType(subProj_bt_644_4)
    buildType(subProj_bt_644_5)
    buildType(subProj_bt_644_2)
    buildType(subProj_bt_644_3)
    buildType(subProj_bt_644_0)
    buildType(subProj_bt_644_1)
})
