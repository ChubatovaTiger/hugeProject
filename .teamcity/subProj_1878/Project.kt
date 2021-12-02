package subProj_1878

import subProj_1878.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1878")
    name = "subProj 1878"

    buildType(subProj_bt_1878_0)
    buildType(subProj_bt_1878_1)
    buildType(subProj_bt_1878_4)
    buildType(subProj_bt_1878_5)
    buildType(subProj_bt_1878_2)
    buildType(subProj_bt_1878_3)
})
