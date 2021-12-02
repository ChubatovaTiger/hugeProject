package subProj_724

import subProj_724.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_724")
    name = "subProj 724"

    buildType(subProj_bt_724_5)
    buildType(subProj_bt_724_4)
    buildType(subProj_bt_724_3)
    buildType(subProj_bt_724_2)
    buildType(subProj_bt_724_1)
    buildType(subProj_bt_724_0)
})
