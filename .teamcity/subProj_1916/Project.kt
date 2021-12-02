package subProj_1916

import subProj_1916.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1916")
    name = "subProj 1916"

    buildType(subProj_bt_1916_5)
    buildType(subProj_bt_1916_0)
    buildType(subProj_bt_1916_3)
    buildType(subProj_bt_1916_4)
    buildType(subProj_bt_1916_1)
    buildType(subProj_bt_1916_2)
})
