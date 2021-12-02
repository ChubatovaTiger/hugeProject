package subProj_946

import subProj_946.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_946")
    name = "subProj 946"

    buildType(subProj_bt_946_1)
    buildType(subProj_bt_946_2)
    buildType(subProj_bt_946_3)
    buildType(subProj_bt_946_4)
    buildType(subProj_bt_946_5)
    buildType(subProj_bt_946_0)
})
