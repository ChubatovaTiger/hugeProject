package subProj_616

import subProj_616.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_616")
    name = "subProj 616"

    buildType(subProj_bt_616_5)
    buildType(subProj_bt_616_2)
    buildType(subProj_bt_616_1)
    buildType(subProj_bt_616_4)
    buildType(subProj_bt_616_3)
    buildType(subProj_bt_616_0)
})
