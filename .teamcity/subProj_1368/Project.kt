package subProj_1368

import subProj_1368.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1368")
    name = "subProj 1368"

    buildType(subProj_bt_1368_5)
    buildType(subProj_bt_1368_4)
    buildType(subProj_bt_1368_3)
    buildType(subProj_bt_1368_2)
    buildType(subProj_bt_1368_1)
    buildType(subProj_bt_1368_0)
})
