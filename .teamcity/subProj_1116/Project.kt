package subProj_1116

import subProj_1116.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1116")
    name = "subProj 1116"

    buildType(subProj_bt_1116_0)
    buildType(subProj_bt_1116_2)
    buildType(subProj_bt_1116_1)
    buildType(subProj_bt_1116_4)
    buildType(subProj_bt_1116_3)
    buildType(subProj_bt_1116_5)
})
