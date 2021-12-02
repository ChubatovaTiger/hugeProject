package subProj_1912

import subProj_1912.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1912")
    name = "subProj 1912"

    buildType(subProj_bt_1912_0)
    buildType(subProj_bt_1912_3)
    buildType(subProj_bt_1912_4)
    buildType(subProj_bt_1912_1)
    buildType(subProj_bt_1912_2)
    buildType(subProj_bt_1912_5)
})
