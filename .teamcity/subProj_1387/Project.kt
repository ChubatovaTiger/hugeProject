package subProj_1387

import subProj_1387.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1387")
    name = "subProj 1387"

    buildType(subProj_bt_1387_1)
    buildType(subProj_bt_1387_2)
    buildType(subProj_bt_1387_3)
    buildType(subProj_bt_1387_4)
    buildType(subProj_bt_1387_5)
    buildType(subProj_bt_1387_0)
})
