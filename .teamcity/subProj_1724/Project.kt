package subProj_1724

import subProj_1724.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1724")
    name = "subProj 1724"

    buildType(subProj_bt_1724_0)
    buildType(subProj_bt_1724_1)
    buildType(subProj_bt_1724_4)
    buildType(subProj_bt_1724_5)
    buildType(subProj_bt_1724_2)
    buildType(subProj_bt_1724_3)
})
