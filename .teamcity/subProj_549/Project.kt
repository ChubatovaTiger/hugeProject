package subProj_549

import subProj_549.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_549")
    name = "subProj 549"

    buildType(subProj_bt_549_0)
    buildType(subProj_bt_549_1)
    buildType(subProj_bt_549_2)
    buildType(subProj_bt_549_3)
    buildType(subProj_bt_549_4)
    buildType(subProj_bt_549_5)
})
