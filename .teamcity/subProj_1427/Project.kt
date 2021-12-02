package subProj_1427

import subProj_1427.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1427")
    name = "subProj 1427"

    buildType(subProj_bt_1427_2)
    buildType(subProj_bt_1427_3)
    buildType(subProj_bt_1427_4)
    buildType(subProj_bt_1427_5)
    buildType(subProj_bt_1427_0)
    buildType(subProj_bt_1427_1)
})
