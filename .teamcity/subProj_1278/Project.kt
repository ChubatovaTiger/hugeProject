package subProj_1278

import subProj_1278.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1278")
    name = "subProj 1278"

    buildType(subProj_bt_1278_2)
    buildType(subProj_bt_1278_3)
    buildType(subProj_bt_1278_0)
    buildType(subProj_bt_1278_1)
    buildType(subProj_bt_1278_4)
    buildType(subProj_bt_1278_5)
})
