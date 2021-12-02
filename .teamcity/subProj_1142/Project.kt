package subProj_1142

import subProj_1142.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1142")
    name = "subProj 1142"

    buildType(subProj_bt_1142_4)
    buildType(subProj_bt_1142_5)
    buildType(subProj_bt_1142_2)
    buildType(subProj_bt_1142_3)
    buildType(subProj_bt_1142_0)
    buildType(subProj_bt_1142_1)
})
