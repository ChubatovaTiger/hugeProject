package subProj_916

import subProj_916.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_916")
    name = "subProj 916"

    buildType(subProj_bt_916_5)
    buildType(subProj_bt_916_4)
    buildType(subProj_bt_916_3)
    buildType(subProj_bt_916_2)
    buildType(subProj_bt_916_1)
    buildType(subProj_bt_916_0)
})
