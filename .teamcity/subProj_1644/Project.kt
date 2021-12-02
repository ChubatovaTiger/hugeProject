package subProj_1644

import subProj_1644.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1644")
    name = "subProj 1644"

    buildType(subProj_bt_1644_5)
    buildType(subProj_bt_1644_0)
    buildType(subProj_bt_1644_2)
    buildType(subProj_bt_1644_1)
    buildType(subProj_bt_1644_4)
    buildType(subProj_bt_1644_3)
})
