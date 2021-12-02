package subProj_672

import subProj_672.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_672")
    name = "subProj 672"

    buildType(subProj_bt_672_2)
    buildType(subProj_bt_672_1)
    buildType(subProj_bt_672_0)
    buildType(subProj_bt_672_5)
    buildType(subProj_bt_672_4)
    buildType(subProj_bt_672_3)
})
