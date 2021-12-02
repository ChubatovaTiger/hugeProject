package subProj_1458

import subProj_1458.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1458")
    name = "subProj 1458"

    buildType(subProj_bt_1458_5)
    buildType(subProj_bt_1458_4)
    buildType(subProj_bt_1458_1)
    buildType(subProj_bt_1458_0)
    buildType(subProj_bt_1458_3)
    buildType(subProj_bt_1458_2)
})
