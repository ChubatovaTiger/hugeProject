package subProj_1132

import subProj_1132.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1132")
    name = "subProj 1132"

    buildType(subProj_bt_1132_5)
    buildType(subProj_bt_1132_3)
    buildType(subProj_bt_1132_4)
    buildType(subProj_bt_1132_1)
    buildType(subProj_bt_1132_2)
    buildType(subProj_bt_1132_0)
})
