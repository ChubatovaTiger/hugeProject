package subProj_1749

import subProj_1749.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1749")
    name = "subProj 1749"

    buildType(subProj_bt_1749_5)
    buildType(subProj_bt_1749_4)
    buildType(subProj_bt_1749_3)
    buildType(subProj_bt_1749_2)
    buildType(subProj_bt_1749_1)
    buildType(subProj_bt_1749_0)
})
