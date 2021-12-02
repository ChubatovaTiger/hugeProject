package subProj_1421

import subProj_1421.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1421")
    name = "subProj 1421"

    buildType(subProj_bt_1421_4)
    buildType(subProj_bt_1421_5)
    buildType(subProj_bt_1421_0)
    buildType(subProj_bt_1421_1)
    buildType(subProj_bt_1421_2)
    buildType(subProj_bt_1421_3)
})
