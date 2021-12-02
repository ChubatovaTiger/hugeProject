package subProj_1167

import subProj_1167.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1167")
    name = "subProj 1167"

    buildType(subProj_bt_1167_4)
    buildType(subProj_bt_1167_3)
    buildType(subProj_bt_1167_2)
    buildType(subProj_bt_1167_1)
    buildType(subProj_bt_1167_5)
    buildType(subProj_bt_1167_0)
})
