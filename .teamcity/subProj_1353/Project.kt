package subProj_1353

import subProj_1353.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1353")
    name = "subProj 1353"

    buildType(subProj_bt_1353_1)
    buildType(subProj_bt_1353_0)
    buildType(subProj_bt_1353_5)
    buildType(subProj_bt_1353_4)
    buildType(subProj_bt_1353_3)
    buildType(subProj_bt_1353_2)
})
