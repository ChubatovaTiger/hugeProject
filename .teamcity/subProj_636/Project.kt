package subProj_636

import subProj_636.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_636")
    name = "subProj 636"

    buildType(subProj_bt_636_4)
    buildType(subProj_bt_636_3)
    buildType(subProj_bt_636_5)
    buildType(subProj_bt_636_0)
    buildType(subProj_bt_636_2)
    buildType(subProj_bt_636_1)
})
