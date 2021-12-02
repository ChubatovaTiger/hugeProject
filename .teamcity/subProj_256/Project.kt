package subProj_256

import subProj_256.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_256")
    name = "subProj 256"

    buildType(subProj_bt_256_5)
    buildType(subProj_bt_256_3)
    buildType(subProj_bt_256_4)
    buildType(subProj_bt_256_1)
    buildType(subProj_bt_256_2)
    buildType(subProj_bt_256_0)
})
