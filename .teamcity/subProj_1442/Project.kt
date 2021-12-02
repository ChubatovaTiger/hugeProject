package subProj_1442

import subProj_1442.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1442")
    name = "subProj 1442"

    buildType(subProj_bt_1442_0)
    buildType(subProj_bt_1442_5)
    buildType(subProj_bt_1442_2)
    buildType(subProj_bt_1442_1)
    buildType(subProj_bt_1442_4)
    buildType(subProj_bt_1442_3)
})