package subProj_1636

import subProj_1636.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1636")
    name = "subProj 1636"

    buildType(subProj_bt_1636_2)
    buildType(subProj_bt_1636_3)
    buildType(subProj_bt_1636_4)
    buildType(subProj_bt_1636_5)
    buildType(subProj_bt_1636_0)
    buildType(subProj_bt_1636_1)
})
