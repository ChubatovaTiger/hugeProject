package subProj_224

import subProj_224.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_224")
    name = "subProj 224"

    buildType(subProj_bt_224_5)
    buildType(subProj_bt_224_4)
    buildType(subProj_bt_224_1)
    buildType(subProj_bt_224_0)
    buildType(subProj_bt_224_3)
    buildType(subProj_bt_224_2)
})
