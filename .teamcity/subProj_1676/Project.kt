package subProj_1676

import subProj_1676.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1676")
    name = "subProj 1676"

    buildType(subProj_bt_1676_0)
    buildType(subProj_bt_1676_1)
    buildType(subProj_bt_1676_4)
    buildType(subProj_bt_1676_5)
    buildType(subProj_bt_1676_2)
    buildType(subProj_bt_1676_3)
})
