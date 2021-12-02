package subProj_1934

import subProj_1934.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1934")
    name = "subProj 1934"

    buildType(subProj_bt_1934_0)
    buildType(subProj_bt_1934_4)
    buildType(subProj_bt_1934_3)
    buildType(subProj_bt_1934_2)
    buildType(subProj_bt_1934_1)
    buildType(subProj_bt_1934_5)
})
