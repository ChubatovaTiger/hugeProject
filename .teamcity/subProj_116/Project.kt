package subProj_116

import subProj_116.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_116")
    name = "subProj 116"

    buildType(subProj_bt_116_4)
    buildType(subProj_bt_116_5)
    buildType(subProj_bt_116_2)
    buildType(subProj_bt_116_3)
    buildType(subProj_bt_116_0)
    buildType(subProj_bt_116_1)
})
