package subProj_934

import subProj_934.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_934")
    name = "subProj 934"

    buildType(subProj_bt_934_2)
    buildType(subProj_bt_934_3)
    buildType(subProj_bt_934_4)
    buildType(subProj_bt_934_5)
    buildType(subProj_bt_934_0)
    buildType(subProj_bt_934_1)
})
