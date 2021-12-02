package subProj_1507

import subProj_1507.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1507")
    name = "subProj 1507"

    buildType(subProj_bt_1507_0)
    buildType(subProj_bt_1507_2)
    buildType(subProj_bt_1507_1)
    buildType(subProj_bt_1507_4)
    buildType(subProj_bt_1507_3)
    buildType(subProj_bt_1507_5)
})
