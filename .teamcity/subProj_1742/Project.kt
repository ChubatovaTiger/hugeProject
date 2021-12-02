package subProj_1742

import subProj_1742.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1742")
    name = "subProj 1742"

    buildType(subProj_bt_1742_5)
    buildType(subProj_bt_1742_4)
    buildType(subProj_bt_1742_3)
    buildType(subProj_bt_1742_2)
    buildType(subProj_bt_1742_1)
    buildType(subProj_bt_1742_0)
})
