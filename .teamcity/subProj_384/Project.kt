package subProj_384

import subProj_384.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_384")
    name = "subProj 384"

    buildType(subProj_bt_384_5)
    buildType(subProj_bt_384_2)
    buildType(subProj_bt_384_1)
    buildType(subProj_bt_384_4)
    buildType(subProj_bt_384_3)
    buildType(subProj_bt_384_0)
})
