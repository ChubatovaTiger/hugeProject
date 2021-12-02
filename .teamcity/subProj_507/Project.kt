package subProj_507

import subProj_507.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_507")
    name = "subProj 507"

    buildType(subProj_bt_507_4)
    buildType(subProj_bt_507_5)
    buildType(subProj_bt_507_2)
    buildType(subProj_bt_507_3)
    buildType(subProj_bt_507_0)
    buildType(subProj_bt_507_1)
})
