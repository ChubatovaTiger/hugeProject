package subProj_1946

import subProj_1946.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1946")
    name = "subProj 1946"

    buildType(subProj_bt_1946_3)
    buildType(subProj_bt_1946_2)
    buildType(subProj_bt_1946_1)
    buildType(subProj_bt_1946_0)
    buildType(subProj_bt_1946_5)
    buildType(subProj_bt_1946_4)
})
