package subProj_1248

import subProj_1248.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1248")
    name = "subProj 1248"

    buildType(subProj_bt_1248_0)
    buildType(subProj_bt_1248_1)
    buildType(subProj_bt_1248_2)
    buildType(subProj_bt_1248_3)
    buildType(subProj_bt_1248_4)
    buildType(subProj_bt_1248_5)
})
