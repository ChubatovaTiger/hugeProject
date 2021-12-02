package subProj_1687

import subProj_1687.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1687")
    name = "subProj 1687"

    buildType(subProj_bt_1687_1)
    buildType(subProj_bt_1687_0)
    buildType(subProj_bt_1687_5)
    buildType(subProj_bt_1687_4)
    buildType(subProj_bt_1687_3)
    buildType(subProj_bt_1687_2)
})
