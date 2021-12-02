package subProj_878

import subProj_878.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_878")
    name = "subProj 878"

    buildType(subProj_bt_878_5)
    buildType(subProj_bt_878_4)
    buildType(subProj_bt_878_3)
    buildType(subProj_bt_878_2)
    buildType(subProj_bt_878_1)
    buildType(subProj_bt_878_0)
})
