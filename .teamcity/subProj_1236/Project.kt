package subProj_1236

import subProj_1236.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1236")
    name = "subProj 1236"

    buildType(subProj_bt_1236_0)
    buildType(subProj_bt_1236_1)
    buildType(subProj_bt_1236_2)
    buildType(subProj_bt_1236_3)
    buildType(subProj_bt_1236_4)
    buildType(subProj_bt_1236_5)
})
