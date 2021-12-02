package subProj_1491

import subProj_1491.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1491")
    name = "subProj 1491"

    buildType(subProj_bt_1491_5)
    buildType(subProj_bt_1491_4)
    buildType(subProj_bt_1491_3)
    buildType(subProj_bt_1491_2)
    buildType(subProj_bt_1491_1)
    buildType(subProj_bt_1491_0)
})
