package subProj_1499

import subProj_1499.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1499")
    name = "subProj 1499"

    buildType(subProj_bt_1499_5)
    buildType(subProj_bt_1499_4)
    buildType(subProj_bt_1499_3)
    buildType(subProj_bt_1499_2)
    buildType(subProj_bt_1499_1)
    buildType(subProj_bt_1499_0)
})
