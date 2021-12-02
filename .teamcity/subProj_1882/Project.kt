package subProj_1882

import subProj_1882.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1882")
    name = "subProj 1882"

    buildType(subProj_bt_1882_5)
    buildType(subProj_bt_1882_4)
    buildType(subProj_bt_1882_3)
    buildType(subProj_bt_1882_2)
    buildType(subProj_bt_1882_1)
    buildType(subProj_bt_1882_0)
})
