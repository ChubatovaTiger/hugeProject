package subProj_1256

import subProj_1256.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1256")
    name = "subProj 1256"

    buildType(subProj_bt_1256_1)
    buildType(subProj_bt_1256_0)
    buildType(subProj_bt_1256_3)
    buildType(subProj_bt_1256_2)
    buildType(subProj_bt_1256_5)
    buildType(subProj_bt_1256_4)
})
