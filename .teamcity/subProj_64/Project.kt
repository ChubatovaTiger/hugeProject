package subProj_64

import subProj_64.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_64")
    name = "subProj 64"

    buildType(subProj_bt_64_2)
    buildType(subProj_bt_64_3)
    buildType(subProj_bt_64_0)
    buildType(subProj_bt_64_1)
    buildType(subProj_bt_64_4)
    buildType(subProj_bt_64_5)
})
